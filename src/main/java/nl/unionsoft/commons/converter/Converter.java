package nl.unionsoft.commons.converter;

public interface Converter<TARGET, SOURCE> {

    /**
     * Converts SOURCE to TARGET
     * 
     * @param e
     *            The object to convert.
     * 
     * @return The converted object.
     */
    public TARGET convert(final SOURCE e);

}
