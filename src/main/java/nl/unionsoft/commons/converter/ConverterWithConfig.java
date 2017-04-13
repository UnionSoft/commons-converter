package nl.unionsoft.commons.converter;


public interface ConverterWithConfig<TARGET, SOURCE, CONFIG> {

    /**
     * Converts the SOURCE to TARGET with CONFIG
     * 
     * @param e
     *            The entity to convert.
     * 
     * @return The converted DTO.
     */
    public TARGET convert(final SOURCE e, CONFIG configObject);


}
