package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检测项详情分析
 *
 * @author auto create
 * @since 1.0, 2023-07-03 11:36:43
 */
public class ApmobileAppPermissionReportDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 3518281449958856337L;

	/**
	 * 检测详情
	 */
	@ApiListField("detect_detail_list")
	@ApiField("apmobile_detect_detail_d_t_o")
	private List<ApmobileDetectDetailDTO> detectDetailList;

	public List<ApmobileDetectDetailDTO> getDetectDetailList() {
		return this.detectDetailList;
	}
	public void setDetectDetailList(List<ApmobileDetectDetailDTO> detectDetailList) {
		this.detectDetailList = detectDetailList;
	}

}
