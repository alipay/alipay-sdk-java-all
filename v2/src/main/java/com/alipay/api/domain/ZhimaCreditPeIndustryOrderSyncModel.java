package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品订单同步
 *
 * @author auto create
 * @since 1.0, 2022-12-29 10:37:41
 */
public class ZhimaCreditPeIndustryOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3113455685158779229L;

	/**
	 * 业务场景,分时租赁平台:car_sharing_zhima,具体业务对应的业务场景请联系业务确认
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 订单待同步信息,不能为空，json格式字符串，自定义key需要提前与接口owner进行沟通确认,注意:如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getZmOrderId() {
		return this.zmOrderId;
	}
	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}

}
