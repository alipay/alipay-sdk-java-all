package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福医生端外部机构消息数量同步
 *
 * @author auto create
 * @since 1.0, 2026-08-24 16:49:12
 */
public class AlipayCommerceMedicalDoctorMsgcountSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4121667722735873793L;

	/**
	 * AQ用户ID（2089、2090）
	 */
	@ApiField("aq_user_id")
	private String aqUserId;

	/**
	 * AQ用户ID（2089、2090）
	 */
	@ApiField("aq_user_open_id")
	private String aqUserOpenId;

	/**
	 * 外部传入，随机生成
	 */
	@ApiField("out_app_id")
	private String outAppId;

	/**
	 * 外部传入，随机生成
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 剩余未读消息数
	 */
	@ApiField("un_read_count")
	private Long unReadCount;

	public String getAqUserId() {
		return this.aqUserId;
	}
	public void setAqUserId(String aqUserId) {
		this.aqUserId = aqUserId;
	}

	public String getAqUserOpenId() {
		return this.aqUserOpenId;
	}
	public void setAqUserOpenId(String aqUserOpenId) {
		this.aqUserOpenId = aqUserOpenId;
	}

	public String getOutAppId() {
		return this.outAppId;
	}
	public void setOutAppId(String outAppId) {
		this.outAppId = outAppId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public Long getUnReadCount() {
		return this.unReadCount;
	}
	public void setUnReadCount(Long unReadCount) {
		this.unReadCount = unReadCount;
	}

}
