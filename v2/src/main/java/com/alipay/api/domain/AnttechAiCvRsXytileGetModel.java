package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * max遥感工作台瓦片服务
 *
 * @author auto create
 * @since 1.0, 2023-04-13 17:40:57
 */
public class AnttechAiCvRsXytileGetModel extends AlipayObject {

	private static final long serialVersionUID = 5894256338223579648L;

	/**
	 * 用于描述不同的业务场景
	 */
	@ApiField("biz_name")
	private String bizName;

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
	 * 101：玉米
115：大豆
147：水稻
	 */
	@ApiField("object_type")
	private String objectType;

	/**
	 * 查询参数
	 */
	@ApiField("query_params")
	private String queryParams;

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

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

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

	public String getObjectType() {
		return this.objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getQueryParams() {
		return this.queryParams;
	}
	public void setQueryParams(String queryParams) {
		this.queryParams = queryParams;
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
