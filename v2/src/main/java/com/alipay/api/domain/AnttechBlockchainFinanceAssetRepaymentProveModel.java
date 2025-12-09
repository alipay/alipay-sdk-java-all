package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链资产还款证明
 *
 * @author auto create
 * @since 1.0, 2022-10-12 12:46:18
 */
public class AnttechBlockchainFinanceAssetRepaymentProveModel extends AlipayObject {

	private static final long serialVersionUID = 7725671634751391353L;

	/**
	 * 资产包ID
	 */
	@ApiField("asset_package_id")
	private String assetPackageId;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 报文编码算法
	 */
	@ApiField("encode_type")
	private String encodeType;

	/**
	 * 证明相关原始加密/压缩请求报文
	 */
	@ApiField("prove_encoded_req")
	private String proveEncodedReq;

	/**
	 * 证明相关原始加密/压缩应答报文
	 */
	@ApiField("prove_encoded_res")
	private String proveEncodedRes;

	/**
	 * 还款操作类型
	 */
	@ApiField("repay_action")
	private String repayAction;

	/**
	 * 请求序列号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAssetPackageId() {
		return this.assetPackageId;
	}
	public void setAssetPackageId(String assetPackageId) {
		this.assetPackageId = assetPackageId;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getEncodeType() {
		return this.encodeType;
	}
	public void setEncodeType(String encodeType) {
		this.encodeType = encodeType;
	}

	public String getProveEncodedReq() {
		return this.proveEncodedReq;
	}
	public void setProveEncodedReq(String proveEncodedReq) {
		this.proveEncodedReq = proveEncodedReq;
	}

	public String getProveEncodedRes() {
		return this.proveEncodedRes;
	}
	public void setProveEncodedRes(String proveEncodedRes) {
		this.proveEncodedRes = proveEncodedRes;
	}

	public String getRepayAction() {
		return this.repayAction;
	}
	public void setRepayAction(String repayAction) {
		this.repayAction = repayAction;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
