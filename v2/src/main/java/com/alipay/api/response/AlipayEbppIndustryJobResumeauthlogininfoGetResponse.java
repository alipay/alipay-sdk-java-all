package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResumeAttribute;
import com.alipay.api.domain.UserIntentionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.resumeauthlogininfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 14:45:57
 */
public class AlipayEbppIndustryJobResumeauthlogininfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8332486162366797584L;

	/** 
	 * 城市编码
	 */
	@ApiField("ad_code")
	private String adCode;

	/** 
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * null
	 */
	@ApiListField("resume_attributes")
	@ApiField("resume_attribute")
	private List<ResumeAttribute> resumeAttributes;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 求职意向
	 */
	@ApiField("user_intention_info")
	private UserIntentionInfo userIntentionInfo;

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}
	public String getAdCode( ) {
		return this.adCode;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setResumeAttributes(List<ResumeAttribute> resumeAttributes) {
		this.resumeAttributes = resumeAttributes;
	}
	public List<ResumeAttribute> getResumeAttributes( ) {
		return this.resumeAttributes;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserIntentionInfo(UserIntentionInfo userIntentionInfo) {
		this.userIntentionInfo = userIntentionInfo;
	}
	public UserIntentionInfo getUserIntentionInfo( ) {
		return this.userIntentionInfo;
	}

}
