package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-26 18:07:44
 */
public class DepositFileList extends AlipayObject {

	private static final long serialVersionUID = 8719891632531535318L;

	/**
	 * 文件存证成功后给出的证明文件
	 */
	@ApiField("deposit_certify_url")
	private String depositCertifyUrl;

	/**
	 * 文件Hash值
	 */
	@ApiField("file_hash")
	private String fileHash;

	/**
	 * 文件的md5值
	 */
	@ApiField("file_md_5")
	private String fileMd5;

	/**
	 * 存证的文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 链上存证hash
	 */
	@ApiField("tx_hash")
	private String txHash;

	public String getDepositCertifyUrl() {
		return this.depositCertifyUrl;
	}
	public void setDepositCertifyUrl(String depositCertifyUrl) {
		this.depositCertifyUrl = depositCertifyUrl;
	}

	public String getFileHash() {
		return this.fileHash;
	}
	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
	}

	public String getFileMd5() {
		return this.fileMd5;
	}
	public void setFileMd5(String fileMd5) {
		this.fileMd5 = fileMd5;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTxHash() {
		return this.txHash;
	}
	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}

}
