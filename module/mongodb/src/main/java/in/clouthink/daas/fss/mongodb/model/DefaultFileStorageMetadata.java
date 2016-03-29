package in.clouthink.daas.fss.mongodb.model;

import in.clouthink.daas.fss.core.FileStorageMetadata;

import java.util.Properties;

/**
 * Created by dz on 16/3/29.
 */
public class DefaultFileStorageMetadata implements FileStorageMetadata {

	private Properties publicProperties = new Properties();

	private Properties privateProperties = new Properties();

	@Override
	public Properties getPublicProperties() {
		return publicProperties;
	}

	public void setPublicProperties(Properties publicProperties) {
		this.publicProperties = publicProperties;
	}

	@Override
	public Properties getPrivateProperties() {
		return privateProperties;
	}

	public void setPrivateProperties(Properties privateProperties) {
		this.privateProperties = privateProperties;
	}
}
