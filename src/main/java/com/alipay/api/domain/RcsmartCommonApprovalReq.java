package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解语花审核内容请求类
 *
 * @author auto create
 * @since 1.0, 2022-08-23 19:47:55
 */
public class RcsmartCommonApprovalReq extends AlipayObject {

	private static final long serialVersionUID = 6559785541786756625L;

	/**
	 * 业务ID，一个业务bizId代表当前业务，可以包含多个场景，与scene_code之间为一对多的关系。 @结月分配
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 预留参数，K-V格式
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 请求Id，与app_name组成唯一健，保证业务请求幂等性，同时在请求完毕后，获取业务风险详情信息结果使用
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景素材信息。Map的key为场景编码，value为素材列表信息
	 */
	@ApiListField("scene_content_data_list")
	@ApiField("rcsmart_scene_content_data")
	private List<RcsmartSceneContentData> sceneContentDataList;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RcsmartSceneContentData> getSceneContentDataList() {
		return this.sceneContentDataList;
	}
	public void setSceneContentDataList(List<RcsmartSceneContentData> sceneContentDataList) {
		this.sceneContentDataList = sceneContentDataList;
	}

}
