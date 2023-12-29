package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产发行提交
 *
 * @author auto create
 * @since 1.0, 2019-12-26 10:58:46
 */
public class AnttechBlockchainFinanceAssetIssueSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2261415915526678125L;

	/**
	 * 资产预申请成功后返回的内部资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 针对sign_data签名的对应公钥
	 */
	@ApiField("pub_key")
	private String pubKey;

	/**
	 * 针对sign_data签名的签名算法，目前支持SHA256WithRSA/SHA1WithRSA/SM3WithSM2
	 */
	@ApiField("sign_algorithm")
	private String signAlgorithm;

	/**
	 * 资产预申请成功后返回的待签名数据，对原始utf-8编码的xml签名数据，做base64编码
	 */
	@ApiField("sign_data")
	private String signData;

	/**
	 * 针对sign_data的签名，Base64格式编码
	 */
	@ApiField("signature")
	private String signature;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getPubKey() {
		return this.pubKey;
	}
	public void setPubKey(String pubKey) {
		this.pubKey = pubKey;
	}

	public String getSignAlgorithm() {
		return this.signAlgorithm;
	}
	public void setSignAlgorithm(String signAlgorithm) {
		this.signAlgorithm = signAlgorithm;
	}

	public String getSignData() {
		return this.signData;
	}
	public void setSignData(String signData) {
		this.signData = signData;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
