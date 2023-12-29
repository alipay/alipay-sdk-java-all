package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用征信数据提交
 *
 * @author auto create
 * @since 1.0, 2023-05-11 20:19:14
 */
public class ZhimaCreditEpCreditlinkDataSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4315693116855773417L;

	/**
	 * 任务采集ID
	 */
	@ApiField("collect_id")
	private String collectId;

	/**
	 * 消费商户号，可在没有collect_id的时候使用
	 */
	@ApiField("consumer_merchant_no")
	private String consumerMerchantNo;

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
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求流水号。保证单场景全局唯一
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getCollectId() {
		return this.collectId;
	}
	public void setCollectId(String collectId) {
		this.collectId = collectId;
	}

	public String getConsumerMerchantNo() {
		return this.consumerMerchantNo;
	}
	public void setConsumerMerchantNo(String consumerMerchantNo) {
		this.consumerMerchantNo = consumerMerchantNo;
	}

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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
