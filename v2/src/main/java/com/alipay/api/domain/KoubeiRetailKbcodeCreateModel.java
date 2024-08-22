package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消行业口碑码创建接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:17:47
 */
public class KoubeiRetailKbcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5774765133388438655L;

	/**
	 * 口碑码绑定的附加信息列表，最大数量150
	 */
	@ApiListField("code_info_list")
	@ApiField("retail_kbcode_create_vo")
	private List<RetailKbcodeCreateVo> codeInfoList;

	/**
	 * 物料模板（口碑码的背景图，目前仅支持：RETAIL_PASTER_296_320）
	 */
	@ApiField("code_template")
	private String codeTemplate;

	/**
	 * 生成码的类型（当前仅支持品牌商促销员码：KOUBEI_SALESMAN_CODEC）
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 请求流水ID，可用于幂等控制，建议使用UUID做幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	public List<RetailKbcodeCreateVo> getCodeInfoList() {
		return this.codeInfoList;
	}
	public void setCodeInfoList(List<RetailKbcodeCreateVo> codeInfoList) {
		this.codeInfoList = codeInfoList;
	}

	public String getCodeTemplate() {
		return this.codeTemplate;
	}
	public void setCodeTemplate(String codeTemplate) {
		this.codeTemplate = codeTemplate;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
