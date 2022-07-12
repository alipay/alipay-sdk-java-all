package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 乘车码信息查询
 *
 * @author auto create
 * @since 1.0, 2021-09-08 10:15:14
 */
public class AlipayPayAppTransportCardinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6838441379782874692L;

	/**
	 * 具体查询的子命令
	 */
	@ApiField("command")
	private String command;

	/**
	 * 加密信息密文
	 */
	@ApiField("encoded_cipher")
	private String encodedCipher;

	/**
	 * KMI密钥版本号
	 */
	@ApiField("k_version")
	private Long kVersion;

	/**
	 * 设备ID密文
	 */
	@ApiField("tid_cipher")
	private String tidCipher;

	public String getCommand() {
		return this.command;
	}
	public void setCommand(String command) {
		this.command = command;
	}

	public String getEncodedCipher() {
		return this.encodedCipher;
	}
	public void setEncodedCipher(String encodedCipher) {
		this.encodedCipher = encodedCipher;
	}

	public Long getkVersion() {
		return this.kVersion;
	}
	public void setkVersion(Long kVersion) {
		this.kVersion = kVersion;
	}

	public String getTidCipher() {
		return this.tidCipher;
	}
	public void setTidCipher(String tidCipher) {
		this.tidCipher = tidCipher;
	}

}
