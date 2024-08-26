package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡券实例批量发放接口
 *
 * @author auto create
 * @since 1.0, 2023-03-20 16:35:06
 */
public class AlipayUserPassInstancebatchAddModel extends AlipayObject {

	private static final long serialVersionUID = 3676414314543795797L;

	/**
	 * alipass实例操作信息列表。
	 */
	@ApiListField("instance_op_list")
	@ApiField("alipass_instance_op_info")
	private List<AlipassInstanceOpInfo> instanceOpList;

	/**
	 * 支付宝用户识别信息，需结合大礼包发券组件使用，对接文档：https://docs.open.alipay.com/199/sy3hs4。
	 */
	@ApiField("recognition_info")
	private String recognitionInfo;

	/**
	 * 对象识别类型，2表示按UserId发券。
	 */
	@ApiField("recognition_type")
	private String recognitionType;

	public List<AlipassInstanceOpInfo> getInstanceOpList() {
		return this.instanceOpList;
	}
	public void setInstanceOpList(List<AlipassInstanceOpInfo> instanceOpList) {
		this.instanceOpList = instanceOpList;
	}

	public String getRecognitionInfo() {
		return this.recognitionInfo;
	}
	public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}

	public String getRecognitionType() {
		return this.recognitionType;
	}
	public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}

}
