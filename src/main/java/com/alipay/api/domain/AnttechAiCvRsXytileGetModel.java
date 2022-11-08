package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * max遥感工作台瓦片服务
 *
 * @author auto create
 * @since 1.0, 2022-10-11 20:58:06
 */
public class AnttechAiCvRsXytileGetModel extends AlipayObject {

	private static final long serialVersionUID = 4658196821566245882L;

	/**
	 * 101：玉米
115：大豆
147：水稻
	 */
	@ApiField("crow_type")
	private String crowType;

	/**
	 * 数据时间
	 */
	@ApiField("date")
	private String date;

	/**
	 * 指标类型
	 */
	@ApiField("index")
	private String index;

	/**
	 * 瓦片x
	 */
	@ApiField("x")
	private String x;

	/**
	 * 瓦片y
	 */
	@ApiField("y")
	private String y;

	/**
	 * 瓦片z
	 */
	@ApiField("z")
	private String z;

	public String getCrowType() {
		return this.crowType;
	}
	public void setCrowType(String crowType) {
		this.crowType = crowType;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getIndex() {
		return this.index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public String getX() {
		return this.x;
	}
	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return this.y;
	}
	public void setY(String y) {
		this.y = y;
	}

	public String getZ() {
		return this.z;
	}
	public void setZ(String z) {
		this.z = z;
	}

}
