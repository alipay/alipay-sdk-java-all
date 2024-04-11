package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动记录轨迹点查询
 *
 * @author auto create
 * @since 1.0, 2023-12-07 19:35:05
 */
public class AlipayUserSportsrecordDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3836461238949419428L;

	/**
	 * 蚂蚁开放平台ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务编码
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 运动流水ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
