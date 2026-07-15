package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.extcard.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 19:52:53
 */
public class AlipayFundAccountbookExtcardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8534245397428744251L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 记账的外卡创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("card_create_time")
	private Date cardCreateTime;

	/** 
	 * 记账的外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 记账的外卡状态, NORMAL
：正常
	 */
	@ApiField("status")
	private String status;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCardCreateTime(Date cardCreateTime) {
		this.cardCreateTime = cardCreateTime;
	}
	public Date getCardCreateTime( ) {
		return this.cardCreateTime;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
