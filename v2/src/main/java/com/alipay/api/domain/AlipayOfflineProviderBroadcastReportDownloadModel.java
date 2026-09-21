package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 音响数据明细文件下载
 *
 * @author auto create
 * @since 1.0, 2026-09-21 16:03:18
 */
public class AlipayOfflineProviderBroadcastReportDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 7841371779776229285L;

	/**
	 * 音响设备SN，输入后将仅导出对应音响设备的数据，同时输入smid和device_sn会取AND逻辑
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 报表生成日期，对应离线报表 dt 分区；当前仅支持T-1日（如今天是2026年9月15日，仅支持输入2026-09-14）
	 */
	@ApiField("report_dt")
	private String reportDt;

	/**
	 * 商户 SMID，映射报表字段 last_bind_merchant_id，输入后将只导出本商户名下所有音响设备的数据，同时输入smid和device_sn会取AND逻辑
	 */
	@ApiField("smid")
	private String smid;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getReportDt() {
		return this.reportDt;
	}
	public void setReportDt(String reportDt) {
		this.reportDt = reportDt;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
