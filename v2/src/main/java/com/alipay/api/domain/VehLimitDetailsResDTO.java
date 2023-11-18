package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本城市当天限行的所有规则
 *
 * @author auto create
 * @since 1.0, 2021-07-01 16:17:16
 */
public class VehLimitDetailsResDTO extends AlipayObject {

	private static final long serialVersionUID = 6897127291358683598L;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 支付宝lbs公共组件cityCode
	 */
	@ApiField("lbs_city_code")
	private String lbsCityCode;

	/**
	 * 限行区域
	 */
	@ApiField("limit_area")
	private String limitArea;

	/**
	 * 规则详情
	 */
	@ApiField("limit_rule_detail")
	private String limitRuleDetail;

	/**
	 * 限行规则名称
	 */
	@ApiField("limit_rule_name")
	private String limitRuleName;

	/**
	 * 此规则涉及尾号
	 */
	@ApiField("limit_tail_num")
	private String limitTailNum;

	/**
	 * 限行时段
	 */
	@ApiField("limit_time")
	private String limitTime;

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getLbsCityCode() {
		return this.lbsCityCode;
	}
	public void setLbsCityCode(String lbsCityCode) {
		this.lbsCityCode = lbsCityCode;
	}

	public String getLimitArea() {
		return this.limitArea;
	}
	public void setLimitArea(String limitArea) {
		this.limitArea = limitArea;
	}

	public String getLimitRuleDetail() {
		return this.limitRuleDetail;
	}
	public void setLimitRuleDetail(String limitRuleDetail) {
		this.limitRuleDetail = limitRuleDetail;
	}

	public String getLimitRuleName() {
		return this.limitRuleName;
	}
	public void setLimitRuleName(String limitRuleName) {
		this.limitRuleName = limitRuleName;
	}

	public String getLimitTailNum() {
		return this.limitTailNum;
	}
	public void setLimitTailNum(String limitTailNum) {
		this.limitTailNum = limitTailNum;
	}

	public String getLimitTime() {
		return this.limitTime;
	}
	public void setLimitTime(String limitTime) {
		this.limitTime = limitTime;
	}

}
