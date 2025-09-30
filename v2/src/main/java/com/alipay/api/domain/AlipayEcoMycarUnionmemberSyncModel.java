package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车企联合会员信息回传
 *
 * @author auto create
 * @since 1.0, 2024-01-29 15:25:15
 */
public class AlipayEcoMycarUnionmemberSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8156736882685724735L;

	/**
	 * 支付宝业务卡号
	 */
	@ApiField("biz_card_no")
	private String bizCardNo;

	/**
	 * 车生活定义的车辆品牌ID，车企接入时咨询对应BD
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 会员卡等级（由商户在卡模板创建时自定义的等级）
	 */
	@ApiField("level")
	private String level;

	/**
	 * 车生活定义的车企ID，车企接入时咨询对应BD
	 */
	@ApiField("manufacturer_id")
	private String manufacturerId;

	/**
	 * 车生活定义的车型ID，车企接入时咨询对应BD
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 业务发生时间，即本次会员信息同步的当前时间
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 开卡时间
	 */
	@ApiField("open_date")
	private Date openDate;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型：开通/更新/关闭 联合会员
	 */
	@ApiField("opt")
	private String opt;

	/**
	 * 车生活定义的车系ID，车企接入时咨询对应BD
	 */
	@ApiField("series_id")
	private String seriesId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 会员卡到期时间
	 */
	@ApiField("valid_date")
	private Date validDate;

	public String getBizCardNo() {
		return this.bizCardNo;
	}
	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getManufacturerId() {
		return this.manufacturerId;
	}
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public Date getOpenDate() {
		return this.openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpt() {
		return this.opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getSeriesId() {
		return this.seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getValidDate() {
		return this.validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

}
