package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游内容对接-飞猪POI同步回调接口
 *
 * @author auto create
 * @since 1.0, 2019-11-14 22:01:06
 */
public class AlipayOverseasTravelFliggyPoiCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4516452765212736388L;

	/**
	 * 同步数据版本
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 店铺ID
	 */
	@ApiField("global_shop_id")
	private String globalShopId;

	/**
	 * 飞猪POI ID
	 */
	@ApiField("poi_data")
	private FliggyPoiInfo poiData;

	/**
	 * 外部请求ID,做幂等
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝端子任务类型，需回传
	 */
	@ApiField("task_subtype")
	private String taskSubtype;

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGlobalShopId() {
		return this.globalShopId;
	}
	public void setGlobalShopId(String globalShopId) {
		this.globalShopId = globalShopId;
	}

	public FliggyPoiInfo getPoiData() {
		return this.poiData;
	}
	public void setPoiData(FliggyPoiInfo poiData) {
		this.poiData = poiData;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskSubtype() {
		return this.taskSubtype;
	}
	public void setTaskSubtype(String taskSubtype) {
		this.taskSubtype = taskSubtype;
	}

}
