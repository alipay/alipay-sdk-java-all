package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线圈活跃数列表
 *
 * @author auto create
 * @since 1.0, 2026-04-27 16:20:23
 */
public class NOrderTagActiveDataDTO extends AlipayObject {

	private static final long serialVersionUID = 1281978928796778968L;

	/**
	 * 线圈外标唯一编号
	 */
	@ApiField("coil_no")
	private String coilNo;

	/**
	 * 线圈内标唯一id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 唤端次数
	 */
	@ApiField("touch_cnt")
	private Long touchCnt;

	/**
	 * 唤端用户数
	 */
	@ApiField("touch_user_cnt")
	private Long touchUserCnt;

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public Long getTouchCnt() {
		return this.touchCnt;
	}
	public void setTouchCnt(Long touchCnt) {
		this.touchCnt = touchCnt;
	}

	public Long getTouchUserCnt() {
		return this.touchUserCnt;
	}
	public void setTouchUserCnt(Long touchUserCnt) {
		this.touchUserCnt = touchUserCnt;
	}

}
