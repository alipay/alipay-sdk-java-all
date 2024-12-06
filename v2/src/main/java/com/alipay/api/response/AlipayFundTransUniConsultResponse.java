package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.uni.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-14 20:42:08
 */
public class AlipayFundTransUniConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5384521355777416224L;

	/** 
	 * 咨询时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consult_date")
	private Date consultDate;

	/** 
	 * 用户可通过guideUrl的引导解除转账限制
	 */
	@ApiField("guide_url")
	private String guideUrl;

	/** 
	 * 转账咨询结果。 SUCCESS（该笔转账咨询成功）：成功； FAIL：失败（咨询不通过）。
注意：转账咨询结果是否通过只代表基于当前入参数和时间的咨询结论，不能100%保证后续使用相同参数一定可以在转账接口处理成功。
	 */
	@ApiField("result")
	private String result;

	public void setConsultDate(Date consultDate) {
		this.consultDate = consultDate;
	}
	public Date getConsultDate( ) {
		return this.consultDate;
	}

	public void setGuideUrl(String guideUrl) {
		this.guideUrl = guideUrl;
	}
	public String getGuideUrl( ) {
		return this.guideUrl;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
