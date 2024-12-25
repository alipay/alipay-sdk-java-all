package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户机构账户余额查询
 *
 * @author auto create
 * @since 1.0, 2022-11-28 16:19:34
 */
public class AlipayFinancialnetAuthBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6442725424358891228L;

	/**
	 * 业务扩展ID，关联外部业务数据ID
	 */
	@ApiField("biz_ext_id")
	private String bizExtId;

	/**
	 * 预留业务扩展字段
	 */
	@ApiField("biz_ext_info")
	private String bizExtInfo;

	/**
	 * 业务扩展类型
	 */
	@ApiField("biz_ext_type")
	private String bizExtType;

	/**
	 * 业务ID
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 查询业务场景大类
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 提交单号-入参指定提交号，则会进行操作校验，用户之前是否有操作流水，Y-返回当前入参指定提交号，N-异常终止
	 */
	@ApiField("submit_no")
	private String submitNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizExtId() {
		return this.bizExtId;
	}
	public void setBizExtId(String bizExtId) {
		this.bizExtId = bizExtId;
	}

	public String getBizExtInfo() {
		return this.bizExtInfo;
	}
	public void setBizExtInfo(String bizExtInfo) {
		this.bizExtInfo = bizExtInfo;
	}

	public String getBizExtType() {
		return this.bizExtType;
	}
	public void setBizExtType(String bizExtType) {
		this.bizExtType = bizExtType;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSubmitNo() {
		return this.submitNo;
	}
	public void setSubmitNo(String submitNo) {
		this.submitNo = submitNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
