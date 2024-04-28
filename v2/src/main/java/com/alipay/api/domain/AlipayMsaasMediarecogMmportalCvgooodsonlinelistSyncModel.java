package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 正在销售的货柜商品清单变更同步接口
 *
 * @author auto create
 * @since 1.0, 2023-07-25 14:58:46
 */
public class AlipayMsaasMediarecogMmportalCvgooodsonlinelistSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1886675313897528727L;

	/**
	 * 行业的补货业务id,唯一键, 用来做幂等和业务追踪
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 机柜序列号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 存放扩展信息, 用于未来接口信息的扩展
	 */
	@ApiField("external_info")
	private String externalInfo;

	/**
	 * 清单中商品的算法id的数组
	 */
	@ApiListField("goods_list")
	@ApiField("string")
	private List<String> goodsList;

	/**
	 * isv的pid号, 不能为空
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 清单提交时间
	 */
	@ApiField("submit_time")
	private Date submitTime;

	/**
	 * 用来未来业务扩展. 目前为动态补货类型
DYNAMIC_ADDING
	 */
	@ApiField("type")
	private String type;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getExternalInfo() {
		return this.externalInfo;
	}
	public void setExternalInfo(String externalInfo) {
		this.externalInfo = externalInfo;
	}

	public List<String> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<String> goodsList) {
		this.goodsList = goodsList;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public Date getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
