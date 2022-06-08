package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻业务状态数据同步接口
 *
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:01
 */
public class ZhimaDataStateDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3114138543932436143L;

	/**
	 * 同步的数据具体内容(json字符串)，开发前与技术对接，将会给出需要的字段模型
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 此状态需要与产品负责人沟通，每个产品维护了不同的状态机。(如约定产品，在电影场景下，需要淘票票商户在用户购票后同步购票信息，则此code=CONTRACT_STATE_WATCH_MOVIE_BUY)
	 */
	@ApiField("biz_state_code")
	private String bizStateCode;

	/**
	 * 此类目为分配给商户在内容下的不同分类，（如电影，直播）
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 外部业务订单流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部主体唯一id。（如淘票票中的电影id）
	 */
	@ApiField("out_principal_id")
	private String outPrincipalId;

	/**
	 * 芝麻信用service_id,商户在入驻芝麻信用商户平台后，创建信用服务完成时会生成唯一的service_id。
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizStateCode() {
		return this.bizStateCode;
	}
	public void setBizStateCode(String bizStateCode) {
		this.bizStateCode = bizStateCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutPrincipalId() {
		return this.outPrincipalId;
	}
	public void setOutPrincipalId(String outPrincipalId) {
		this.outPrincipalId = outPrincipalId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
