package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UniCardFixVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.unicard.card.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-23 11:31:41
 */
public class AlipayMarketingCampaignUnicardCardConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3882653574738537294L;

	/** 
	 * 联营卡卡状态
取值范围：
1. VALID：已生效
2. EXPIRED：已过期
3. REFUNDED：已退卡
4. NOT_OPEN：未开卡
	 */
	@ApiField("card_status")
	private String cardStatus;

	/** 
	 * 联营卡-卡模板id。 限制： 1. 卡模板id和PID目前是一对一的关系； 2. 卡模板id与C端页面一一对应； 3. 同一个商户只能查询和操作自己的卡模板id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/** 
	 * 城市码，具体的城市码与城市的映射关系需要联系支付宝研发人员确定，可能与公开数据有所出入。
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 如果用户可开卡，则直接返回SUCCESS
如果该用户不可开卡，此字段列出不可开卡的原因。
取值范围（字段中返回文字描述）：
1. NOT_OPEN_CITY：不在活动城市
2. SOLD_OUT：库存已售罄
3. ACTIVITY_NOT_START：活动未开始
4. ACTIVITY_ENDED：活动已结束
	 */
	@ApiField("consult_result_code")
	private String consultResultCode;

	/** 
	 * 当前用户当前周期的联营卡过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 用户有生效中的卡，返回卡下的满减券信息。
	 */
	@ApiListField("fix_voucher_infos")
	@ApiField("uni_card_fix_voucher_info")
	private List<UniCardFixVoucherInfo> fixVoucherInfos;

	/** 
	 * 联营卡售价
单位为人民币，元。
限制联营卡售价为一个周期的卡售价。
比如9.9元每月
	 */
	@ApiField("sale_price")
	private String salePrice;

	/** 
	 * 联营卡子状态
需要通过卡子状态去进一步细化表达联营卡状态
取值范围：
1. OPENNING：开卡中（父状态为NOT_OPEN)
2. REFUNDING：退卡中（父状态为REFUNDED）
	 */
	@ApiField("sub_card_status")
	private String subCardStatus;

	/** 
	 * 联营卡卡号。
用户在C端开通的联营卡后分配的卡号，目前一个周期的卡号是唯一的，且卡号会对应确定的卡模板id。
	 */
	@ApiField("uni_card_no")
	private String uniCardNo;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	public String getCardStatus( ) {
		return this.cardStatus;
	}

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}
	public String getCardTemplateId( ) {
		return this.cardTemplateId;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setConsultResultCode(String consultResultCode) {
		this.consultResultCode = consultResultCode;
	}
	public String getConsultResultCode( ) {
		return this.consultResultCode;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setFixVoucherInfos(List<UniCardFixVoucherInfo> fixVoucherInfos) {
		this.fixVoucherInfos = fixVoucherInfos;
	}
	public List<UniCardFixVoucherInfo> getFixVoucherInfos( ) {
		return this.fixVoucherInfos;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	public String getSalePrice( ) {
		return this.salePrice;
	}

	public void setSubCardStatus(String subCardStatus) {
		this.subCardStatus = subCardStatus;
	}
	public String getSubCardStatus( ) {
		return this.subCardStatus;
	}

	public void setUniCardNo(String uniCardNo) {
		this.uniCardNo = uniCardNo;
	}
	public String getUniCardNo( ) {
		return this.uniCardNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
