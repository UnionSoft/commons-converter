package nl.unionsoft.commons.converter

import spock.lang.Specification

class ListConverterSpec extends Specification{



    def "convert list"() {
        given:
        Converter converter = new Converter<Bean,Bean>(){
                    Bean convert(Bean) {
                        return Bean;
                    };
                }
                
        def beans = [new Bean(prop: "hello")]
        when:
        def convertedBeans = ListConverter.convert(converter, beans)

        then:
        convertedBeans.size == 1
        convertedBeans[0].prop == "hello"
    }
}
