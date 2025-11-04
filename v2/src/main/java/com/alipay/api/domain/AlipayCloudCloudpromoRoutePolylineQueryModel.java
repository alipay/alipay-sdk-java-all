package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随心游查询路径坐标
 *
 * @author auto create
 * @since 1.0, 2024-12-20 15:07:31
 */
public class AlipayCloudCloudpromoRoutePolylineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6479532739574283449L;

	/**
	 * 当前坐标经纬度，逗号分隔
	 */
	@ApiField("cur_lbs_poi")
	private String curLbsPoi;

	/**
	 * 目的地
	 */
	@ApiField("dest")
	private String dest;

	/**
	 * 目的地经纬度
	 */
	@ApiField("dest_lbs_poi")
	private String destLbsPoi;

	/**
	 * 卡片id；随心游卡片查询必传
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 请求来源，H5表示详情页，返回明细数据；CUBE表示卡片，返回缩略数据
	 */
	@ApiField("source")
	private String source;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	public String getCurLbsPoi() {
		return this.curLbsPoi;
	}
	public void setCurLbsPoi(String curLbsPoi) {
		this.curLbsPoi = curLbsPoi;
	}

	public String getDest() {
		return this.dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDestLbsPoi() {
		return this.destLbsPoi;
	}
	public void setDestLbsPoi(String destLbsPoi) {
		this.destLbsPoi = destLbsPoi;
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
