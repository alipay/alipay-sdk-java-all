package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用征信数据提交
 *
 * @author auto create
 * @since 1.0, 2022-11-24 15:16:38
 */
public class ZhimaCreditEpCreditlinkDataSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6516563441682659243L;

	/**
	 * JSON字符串。征信数据提交内容，具体格式由data_type决定。
	 */
	@ApiField("data_content")
	private String dataContent;

	/**
	 * 信用链接数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 商户订单号。即商户授权申请接口所使用的单号
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 请求流水号。保证单场景全局唯一
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getDataContent() {
		return this.dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
