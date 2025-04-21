package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随心游查完整景点列表
 *
 * @author auto create
 * @since 1.0, 2024-12-20 15:07:31
 */
public class AlipayCloudCloudpromoPartnerAllpoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1356314377694233987L;

	/**
	 * 当前坐标经纬度，逗号分隔
	 */
	@ApiField("cur_lbs_poi")
	private String curLbsPoi;

	/**
	 * 卡片id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 请求来源，默认传H5，H5表示详情页，返回明细数据；CUBE表示卡片，返回缩略数据
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
