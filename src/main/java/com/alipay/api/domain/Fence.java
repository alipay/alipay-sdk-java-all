package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 热力图栅栏
 *
 * @author auto create
 * @since 1.0, 2022-10-14 19:15:52
 */
public class Fence extends AlipayObject {

	private static final long serialVersionUID = 5563559692311941523L;

	/**
	 * 格子内部ID
	 */
	@ApiField("grid_id")
	private String gridId;

	/**
	 * 格子外部ID
	 */
	@ApiField("hex_id")
	private String hexId;

	/**
	 * 订单数
	 */
	@ApiField("order_count")
	private String orderCount;

	/**
	 * 热力图坐标列表由7个坐标点组成，包括一个中心点和六边形的六个顶点，可绘制出一个热力图六边形
	 */
	@ApiListField("points")
	@ApiField("fence_point")
	private List<FencePoint> points;

	/**
	 * 排名
	 */
	@ApiField("rank")
	private String rank;

	public String getGridId() {
		return this.gridId;
	}
	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public String getHexId() {
		return this.hexId;
	}
	public void setHexId(String hexId) {
		this.hexId = hexId;
	}

	public String getOrderCount() {
		return this.orderCount;
	}
	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}

	public List<FencePoint> getPoints() {
		return this.points;
	}
	public void setPoints(List<FencePoint> points) {
		this.points = points;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

}
