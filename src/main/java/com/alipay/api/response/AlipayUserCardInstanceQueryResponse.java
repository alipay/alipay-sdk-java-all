package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.card.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 10:36:32
 */
public class AlipayUserCardInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6449787897446276719L;

	/** 
	 * active_date：卡生效日期，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("active_date")
	private Date activeDate;

	/** 
	 * balance：余额，数字格式，最多支持2位小数
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * card_status：卡状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/** 
	 * expiry_date：卡失效日期，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("expiry_date")
	private Date expiryDate;

	/** 
	 * level：等级名称
	 */
	@ApiField("level")
	private String level;

	/** 
	 * point：积分，数字格式，最多支持2位小数
	 */
	@ApiField("point")
	private String point;

	/** 
	 * template_id：卡模版id，为alipay.user.card.template.create接口返回的模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}
	public Date getActiveDate( ) {
		return this.activeDate;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	public String getCardStatus( ) {
		return this.cardStatus;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getExpiryDate( ) {
		return this.expiryDate;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel( ) {
		return this.level;
	}

	public void setPoint(String point) {
		this.point = point;
	}
	public String getPoint( ) {
		return this.point;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
