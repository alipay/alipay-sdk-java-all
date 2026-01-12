package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建准入检测任务
 *
 * @author auto create
 * @since 1.0, 2020-08-24 20:54:19
 */
public class AlipayEbppDetectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6471621366113345934L;

	/**
	 * 业务类型。巡检平台统一分配。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 数据来源（一般为系统名称）
	 */
	@ApiField("data_from_type")
	private String dataFromType;

	/**
	 * 外部业务标识.如pipelineId
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 检测项列表。支持对链接url、纯文本、图片进行检测。
	 */
	@ApiListField("service_list")
	@ApiField("detect_service_entity")
	private List<DetectServiceEntity> serviceList;

	/**
	 * 小程序appId
	 */
	@ApiField("tinyapp_id")
	private String tinyappId;

	/**
	 * 小程序pid
	 */
	@ApiField("tinyapp_partner_id")
	private String tinyappPartnerId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDataFromType() {
		return this.dataFromType;
	}
	public void setDataFromType(String dataFromType) {
		this.dataFromType = dataFromType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<DetectServiceEntity> getServiceList() {
		return this.serviceList;
	}
	public void setServiceList(List<DetectServiceEntity> serviceList) {
		this.serviceList = serviceList;
	}

	public String getTinyappId() {
		return this.tinyappId;
	}
	public void setTinyappId(String tinyappId) {
		this.tinyappId = tinyappId;
	}

	public String getTinyappPartnerId() {
		return this.tinyappPartnerId;
	}
	public void setTinyappPartnerId(String tinyappPartnerId) {
		this.tinyappPartnerId = tinyappPartnerId;
	}

}
