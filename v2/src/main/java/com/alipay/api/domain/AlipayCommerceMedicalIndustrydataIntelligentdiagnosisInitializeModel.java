package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能导诊机器人初始化接口
 *
 * @author auto create
 * @since 1.0, 2023-12-04 20:17:41
 */
public class AlipayCommerceMedicalIndustrydataIntelligentdiagnosisInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1155579175695935936L;

	/**
	 * 1-120:（传具体年龄值）
0 : 0岁（28天以上）
-1: 0岁（28天内）
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * openid映射
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部用户user的唯一表示：
1. 如果能获取到用户uid就传支付宝uid
2. 如果获取不到支付宝uid，就用内部用户id，看是否可以加个通用标识，比如ET（外端）；
3. 获取不到用户id时，不同的用户访问时，不能传固定id，可以生成一个随机不重复的数，前缀增加个ET-UR-xxx，以便后续区分
	 */
	@ApiField("outer_user_no")
	private String outerUserNo;

	/**
	 * 外部用户类型，区分是否为标准uid或随机数
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 1. 用户首次进入等都为false
2. 用户点击重新导诊的情况下为true
	 */
	@ApiField("refresh")
	private Boolean refresh;

	/**
	 * 请求来源，固定参数
	 */
	@ApiField("source_type")
	private String sourceType;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOuterUserNo() {
		return this.outerUserNo;
	}
	public void setOuterUserNo(String outerUserNo) {
		this.outerUserNo = outerUserNo;
	}

	public String getOuterUserType() {
		return this.outerUserType;
	}
	public void setOuterUserType(String outerUserType) {
		this.outerUserType = outerUserType;
	}

	public Boolean getRefresh() {
		return this.refresh;
	}
	public void setRefresh(Boolean refresh) {
		this.refresh = refresh;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
