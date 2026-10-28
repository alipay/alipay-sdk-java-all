package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YXTAttachmentDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.embenefit.coursetree.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-27 10:44:37
 */
public class AlipayDigitalmgmtEmbenefitCoursetreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4624452322289637386L;

	/** 
	 * null
	 */
	@ApiListField("attachments")
	@ApiField("y_x_t_attachment_d_t_o")
	private List<YXTAttachmentDTO> attachments;

	/** 
	 * 课程id
	 */
	@ApiField("course_id")
	private Long courseId;

	/** 
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/** 
	 * 课程状态：ONLINE 上架；OFFLINE 下架
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private Long tenantId;

	/** 
	 * 课程视频数
	 */
	@ApiField("total_video_count")
	private Long totalVideoCount;

	public void setAttachments(List<YXTAttachmentDTO> attachments) {
		this.attachments = attachments;
	}
	public List<YXTAttachmentDTO> getAttachments( ) {
		return this.attachments;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getCourseId( ) {
		return this.courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName( ) {
		return this.courseName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	public Long getTenantId( ) {
		return this.tenantId;
	}

	public void setTotalVideoCount(Long totalVideoCount) {
		this.totalVideoCount = totalVideoCount;
	}
	public Long getTotalVideoCount( ) {
		return this.totalVideoCount;
	}

}
