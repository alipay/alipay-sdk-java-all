package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生成特定点位作业单
 *
 * @author auto create
 * @since 1.0, 2025-07-24 16:12:33
 */
public class AlipayCommerceLogisticsPointWorkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7624465755483949388L;

	/**
	 * 生成连接的有效期，允许为空。默认有效期1D。
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 商户侧作业编号，64位，用来做幂等控制
	 */
	@ApiField("work_biz_no")
	private String workBizNo;

	/**
	 * null
	 */
	@ApiListField("work_place_list")
	@ApiField("work_place")
	private List<WorkPlace> workPlaceList;

	/**
	 * 物流行业作业平台展示的点位，和铺设点联合使用。见铺设点示例
	 */
	@ApiField("work_point_id")
	private String workPointId;

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getWorkBizNo() {
		return this.workBizNo;
	}
	public void setWorkBizNo(String workBizNo) {
		this.workBizNo = workBizNo;
	}

	public List<WorkPlace> getWorkPlaceList() {
		return this.workPlaceList;
	}
	public void setWorkPlaceList(List<WorkPlace> workPlaceList) {
		this.workPlaceList = workPlaceList;
	}

	public String getWorkPointId() {
		return this.workPointId;
	}
	public void setWorkPointId(String workPointId) {
		this.workPointId = workPointId;
	}

}
