package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardBinVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.comm.parameter response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayBossCommParameterResponse extends AlipayResponse {

	private static final long serialVersionUID = 1585455163539479978L;

	/** 
	 * 根据卡号和instId查询得到的卡bin信息对象,当is_success=true时非空；反之，为空
	 */
	@ApiField("card_bin_vo")
	private CardBinVO cardBinVo;

	/** 
	 * 校验功能是否执行成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 接口执行结果的返回码描述
(SUCCESS=成功,CARD_BIN_NOT_MATCH=卡bin不匹配,SERVICE_ACCESS_FAILURE=服务端访问失败,CARD_NO_BLANK=CARD_NO_BLANK)
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 接口执行结果的返回码
(SUCCESS=成功,CARD_BIN_NOT_MATCH=卡bin不匹配,SERVICE_ACCESS_FAILURE=服务端访问失败,CARD_NO_BLANK=CARD_NO_BLANK)
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setCardBinVo(CardBinVO cardBinVo) {
		this.cardBinVo = cardBinVo;
	}
	public CardBinVO getCardBinVo( ) {
		return this.cardBinVo;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
