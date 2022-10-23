/**
 * This class is generated by jOOQ
 */
package tech.codingclub.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Songs extends org.jooq.impl.TableImpl<tech.codingclub.tables.records.SongsRecord> {

	private static final long serialVersionUID = 1366102569;

	/**
	 * The singleton instance of <code>public.Songs</code>
	 */
	public static final tech.codingclub.tables.Songs SONGS = new tech.codingclub.tables.Songs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<tech.codingclub.tables.records.SongsRecord> getRecordType() {
		return tech.codingclub.tables.records.SongsRecord.class;
	}

	/**
	 * The column <code>public.Songs.name</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.tables.records.SongsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.Songs.url</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.tables.records.SongsRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>public.Songs</code> table reference
	 */
	public Songs() {
		this("Songs", null);
	}

	/**
	 * Create an aliased <code>public.Songs</code> table reference
	 */
	public Songs(java.lang.String alias) {
		this(alias, tech.codingclub.tables.Songs.SONGS);
	}

	private Songs(java.lang.String alias, org.jooq.Table<tech.codingclub.tables.records.SongsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Songs(java.lang.String alias, org.jooq.Table<tech.codingclub.tables.records.SongsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, tech.codingclub.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public tech.codingclub.tables.Songs as(java.lang.String alias) {
		return new tech.codingclub.tables.Songs(alias, this);
	}

	/**
	 * Rename this table
	 */
	public tech.codingclub.tables.Songs rename(java.lang.String name) {
		return new tech.codingclub.tables.Songs(name, null);
	}
}