package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 断直连贷款数据存储服务	
 *
 * @author auto create
 * @since 1.0, 2023-03-22 10:04:49
 */
public class ZhimaCreditEpCreditlinkloanDataSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5567662771158883821L;

	/**
	 * 需要存储的数据内容，是JSON结构，其内容和collect_data_type 相对应，例如{"frontPhotoFileId":"A","reversePhotoFileId":"B","facePhotoFileId":"C"}
	 */
	@ApiField("collect_data_content")
	private String collectDataContent;

	/**
	 * 保存的数据类型
	 */
	@ApiField("collect_data_type")
	private String collectDataType;

	/**
	 * 商户自身的单号，需保证其唯一性
	 */
	@ApiField("merchant_biz_no")
	private String merchantBizNo;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	public String getCollectDataContent() {
		return this.collectDataContent;
	}
	public void setCollectDataContent(String collectDataContent) {
		this.collectDataContent = collectDataContent;
	}

	public String getCollectDataType() {
		return this.collectDataType;
	}
	public void setCollectDataType(String collectDataType) {
		this.collectDataType = collectDataType;
	}

	public String getMerchantBizNo() {
		return this.merchantBizNo;
	}
	public void setMerchantBizNo(String merchantBizNo) {
		this.merchantBizNo = merchantBizNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
