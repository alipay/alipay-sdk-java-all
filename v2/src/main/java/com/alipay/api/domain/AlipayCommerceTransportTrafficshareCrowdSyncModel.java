package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 共享出行业务人群同步
 *
 * @author auto create
 * @since 1.0, 2026-01-14 16:32:42
 */
public class AlipayCommerceTransportTrafficshareCrowdSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3222352397761491725L;

	/**
	 * 由商户侧定义本次业务传输的用户归属的人群类型标识
	 */
	@ApiField("biz_crowd_type_identity")
	private String bizCrowdTypeIdentity;

	/**
	 * 同步日期，格式为YYYYMMDD
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 枚举类型，
顺风车:hitchhike
网约车:onlineride
无人车:tobotaxi
共享单车:bikesharing
私人电动车:ebike
两轮充电:ebikecharging
两轮租车:ebikerental
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("trafficshare_crowd_user_sync")
	private List<TrafficshareCrowdUserSync> dataList;

	public String getBizCrowdTypeIdentity() {
		return this.bizCrowdTypeIdentity;
	}
	public void setBizCrowdTypeIdentity(String bizCrowdTypeIdentity) {
		this.bizCrowdTypeIdentity = bizCrowdTypeIdentity;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public List<TrafficshareCrowdUserSync> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<TrafficshareCrowdUserSync> dataList) {
		this.dataList = dataList;
	}

}
