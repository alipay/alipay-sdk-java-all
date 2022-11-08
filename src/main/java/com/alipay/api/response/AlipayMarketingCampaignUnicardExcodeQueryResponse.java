package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.unicard.excode.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-23 11:31:41
 */
public class AlipayMarketingCampaignUnicardExcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4248789528377575212L;

	/** 
	 * 兑换码是否可以兑换
	 */
	@ApiField("can_exchange")
	private Boolean canExchange;

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
	 * 联营卡卡号。 用户在C端开通的联营卡后分配的卡号，目前一个周期的卡号是唯一的，且卡号会对应确定的卡模板id。
	 */
	@ApiField("exchange_code")
	private String exchangeCode;

	/** 
	 * 兑换码过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 兑换码生成时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 参数名：外部业务单号
应用场景：与支付宝的一个业务单号进行绑定，后续可以通过该业务单号进行查询
如何获取：接口使用方自行生成，为了数据查询的准确性，应该确保该单号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 兑换码状态
取值范围：
1. UNUSED：可使用
2. USED：已使用
3. EXPIRED：已过期
4. INVALID：已失效
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 兑换码不可兑换的原因
取值范围：
1. 活动已经结束
2. 兑换码已失效
3. 兑换码已过期
4. 兑换码已使用
5. 兑换码不存在
	 */
	@ApiField("un_exchange_cause")
	private String unExchangeCause;

	public void setCanExchange(Boolean canExchange) {
		this.canExchange = canExchange;
	}
	public Boolean getCanExchange( ) {
		return this.canExchange;
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

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}
	public String getExchangeCode( ) {
		return this.exchangeCode;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUnExchangeCause(String unExchangeCause) {
		this.unExchangeCause = unExchangeCause;
	}
	public String getUnExchangeCause( ) {
		return this.unExchangeCause;
	}

}
