package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣减用户积分
 *
 * @author auto create
 * @since 1.0, 2023-01-10 20:47:09
 */
public class AlipayInsAutoUserOilExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 5453311948119717853L;

	/**
	 * 验证point与benefitId的一致性，才能使用对应的积分
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 将要扣减的油量（ml）
	 */
	@ApiField("oil")
	private Long oil;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求业务单号，单号一致的两次请求将保证幂等
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 来源，车险分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public Long getOil() {
		return this.oil;
	}
	public void setOil(Long oil) {
		this.oil = oil;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
