package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通用数据画像分析
 *
 * @author auto create
 * @since 1.0, 2023-10-26 20:29:54
 */
public class AlipayMerchantQipanCommoninsightQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7586648272358526525L;

	/**
	 * 如果画像属于某商户，这个字段就是pid；如果是公域人群画像，字段不是pid
	 */
	@ApiField("owner_pid")
	private String ownerPid;

	/**
	 * 画像额外请求参数，用于组装画像唯一键
	 */
	@ApiListField("param_list")
	@ApiField("param_entry")
	private List<ParamEntry> paramList;

	/**
	 * 画像日期分区，为空默认查询最新日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 画像场景码，唯一定义一组画像包含的特征标签
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getOwnerPid() {
		return this.ownerPid;
	}
	public void setOwnerPid(String ownerPid) {
		this.ownerPid = ownerPid;
	}

	public List<ParamEntry> getParamList() {
		return this.paramList;
	}
	public void setParamList(List<ParamEntry> paramList) {
		this.paramList = paramList;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
