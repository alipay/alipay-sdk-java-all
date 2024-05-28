package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业同步的商户商品私库文件
 *
 * @author auto create
 * @since 1.0, 2024-03-28 09:59:59
 */
public class AlipayMsaasMediarecogMmtcaftscvMerchantgoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1771255817224189693L;

	/**
	 * 私库文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}
