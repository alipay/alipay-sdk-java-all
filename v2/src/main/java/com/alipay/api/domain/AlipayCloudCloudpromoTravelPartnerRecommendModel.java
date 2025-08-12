package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随心游下一站推荐
 *
 * @author auto create
 * @since 1.0, 2025-01-14 16:53:22
 */
public class AlipayCloudCloudpromoTravelPartnerRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 7288198545835184636L;

	/**
	 * 当前坐标经纬度，逗号分隔
	 */
	@ApiField("cur_lbs_poi")
	private String curLbsPoi;

	/**
	 * 伴游卡片ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * H5表示页面查询，返回较明细的信息，cube表示对话页卡片信息查询，返回仅卡片需要的缩略信息
	 */
	@ApiField("source")
	private String source;

	/**
	 * 外部用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCurLbsPoi() {
		return this.curLbsPoi;
	}
	public void setCurLbsPoi(String curLbsPoi) {
		this.curLbsPoi = curLbsPoi;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
