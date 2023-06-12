package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员卡信息模型
 *
 * @author auto create
 * @since 1.0, 2018-09-25 15:59:40
 */
public class MallCardUpdate extends AlipayObject {

	private static final long serialVersionUID = 4767249325828767313L;

	/**
	 * 资金卡余额，单位：元，精确到小数点后两位。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 会员业务卡号 
说明： 
1、开卡成功后返回该参数，需要保存留用； 
2、开卡/更新/删卡/查询卡接口请求中都需要传该参数；
	 */
	@ApiField("biz_card_no")
	private String bizCardNo;

	/**
	 * 商户外部会员卡卡号 
说明： 
1、会员卡开卡接口，如果卡类型为外部会员卡，请求中则必须提供该参数； 
2、更新、查询、删除等接口，请求中则不需要提供该参数值；
	 */
	@ApiField("external_card_no")
	private String externalCardNo;

	/**
	 * 会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）
	 */
	@ApiField("level")
	private String level;

	/**
	 * 会员卡积分，积分必须为数字型
	 */
	@ApiField("point")
	private Long point;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBizCardNo() {
		return this.bizCardNo;
	}
	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}

	public String getExternalCardNo() {
		return this.externalCardNo;
	}
	public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

}
