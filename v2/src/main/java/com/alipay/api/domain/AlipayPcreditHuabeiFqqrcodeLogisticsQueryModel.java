package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期分期码物流查询
 *
 * @author auto create
 * @since 1.0, 2023-07-07 11:28:49
 */
public class AlipayPcreditHuabeiFqqrcodeLogisticsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5725999448242468956L;

	/**
	 * 扩展字段,用于一些定制化诉求.
	 */
	@ApiField("fqqr_code_ext_info")
	private FqQrCodeExtendParams fqqrCodeExtInfo;

	/**
	 * 二级商户唯一标识
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 物料订单编号,调用申领接口时获取.
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 服务商唯一标识,联系支付宝工作人员获取.
	 */
	@ApiField("source")
	private String source;

	public FqQrCodeExtendParams getFqqrCodeExtInfo() {
		return this.fqqrCodeExtInfo;
	}
	public void setFqqrCodeExtInfo(FqQrCodeExtendParams fqqrCodeExtInfo) {
		this.fqqrCodeExtInfo = fqqrCodeExtInfo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
