package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 附加文件信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:17:45
 */
public class RentProcurementAdditionalMediaInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8497394179789214559L;

	/**
	 * 签收底单 URL (jpg)
	 */
	@ApiField("electronic_signature_url")
	private String electronicSignatureUrl;

	/**
	 * 电子存根URL（jpg）
	 */
	@ApiField("electronic_stub_url")
	private String electronicStubUrl;

	/**
	 * null
	 */
	@ApiListField("face_active_url_list")
	@ApiField("string")
	private List<String> faceActiveUrlList;

	/**
	 * 面单 URL（pdf）
	 */
	@ApiField("face_document_url")
	private String faceDocumentUrl;

	/**
	 * 签收回执单PDF地址
	 */
	@ApiField("face_sign_url")
	private String faceSignUrl;

	/**
	 * 路由轨迹 URL（pdf）
	 */
	@ApiField("route_tracking_url")
	private String routeTrackingUrl;

	public String getElectronicSignatureUrl() {
		return this.electronicSignatureUrl;
	}
	public void setElectronicSignatureUrl(String electronicSignatureUrl) {
		this.electronicSignatureUrl = electronicSignatureUrl;
	}

	public String getElectronicStubUrl() {
		return this.electronicStubUrl;
	}
	public void setElectronicStubUrl(String electronicStubUrl) {
		this.electronicStubUrl = electronicStubUrl;
	}

	public List<String> getFaceActiveUrlList() {
		return this.faceActiveUrlList;
	}
	public void setFaceActiveUrlList(List<String> faceActiveUrlList) {
		this.faceActiveUrlList = faceActiveUrlList;
	}

	public String getFaceDocumentUrl() {
		return this.faceDocumentUrl;
	}
	public void setFaceDocumentUrl(String faceDocumentUrl) {
		this.faceDocumentUrl = faceDocumentUrl;
	}

	public String getFaceSignUrl() {
		return this.faceSignUrl;
	}
	public void setFaceSignUrl(String faceSignUrl) {
		this.faceSignUrl = faceSignUrl;
	}

	public String getRouteTrackingUrl() {
		return this.routeTrackingUrl;
	}
	public void setRouteTrackingUrl(String routeTrackingUrl) {
		this.routeTrackingUrl = routeTrackingUrl;
	}

}
