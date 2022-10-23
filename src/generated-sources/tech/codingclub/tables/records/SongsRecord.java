/**
 * This class is generated by jOOQ
 */
package tech.codingclub.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SongsRecord extends org.jooq.impl.TableRecordImpl<tech.codingclub.tables.records.SongsRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1382906272;

	/**
	 * Setter for <code>public.Songs.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.Songs.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.Songs.url</code>.
	 */
	public void setUrl(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.Songs.url</code>.
	 */
	public java.lang.String getUrl() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return tech.codingclub.tables.Songs.SONGS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return tech.codingclub.tables.Songs.SONGS.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SongsRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SongsRecord value2(java.lang.String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SongsRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SongsRecord
	 */
	public SongsRecord() {
		super(tech.codingclub.tables.Songs.SONGS);
	}

	/**
	 * Create a detached, initialised SongsRecord
	 */
	public SongsRecord(java.lang.String name, java.lang.String url) {
		super(tech.codingclub.tables.Songs.SONGS);

		setValue(0, name);
		setValue(1, url);
	}
}
