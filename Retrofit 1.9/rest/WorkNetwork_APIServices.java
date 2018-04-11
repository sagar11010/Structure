


import com.squareup.okhttp.RequestBody;
import com.worknetwork.models.AddLikeJob;
import com.worknetwork.models.Apply_Job;
import com.worknetwork.models.Category;
import com.worknetwork.models.ChangePassword;
import com.worknetwork.models.Courses;
import com.worknetwork.models.CoursesType;
import com.worknetwork.models.Currency;
import com.worknetwork.models.Education;
import com.worknetwork.models.Emp_Edit_Profile;
import com.worknetwork.models.EmployerJobListing;
import com.worknetwork.models.EmployerLocation;
import com.worknetwork.models.EmployerRegistration;
import com.worknetwork.models.EmploymentDuration;
import com.worknetwork.models.ForgotPassword;
import com.worknetwork.models.GetCityStateCountry;
import com.worknetwork.models.IndustryType;
import com.worknetwork.models.JobDetails;
import com.worknetwork.models.JobListing;
import com.worknetwork.models.JobPostAdd;
import com.worknetwork.models.JobSearchListing;
import com.worknetwork.models.JobSeekerAchievemet;
import com.worknetwork.models.JobSeekerDetail;
import com.worknetwork.models.JobSeekerEditProfile;
import com.worknetwork.models.JobSeekerEployment;
import com.worknetwork.models.JobSeekerLocation;
import com.worknetwork.models.JobSeekerRegistration;
import com.worknetwork.models.Job_Listing;
import com.worknetwork.models.JobseekerDetailsEmployment;
import com.worknetwork.models.JobseekerEducations;
import com.worknetwork.models.JobseekerJobListing;
import com.worknetwork.models.JobseekerLanguageResponse;
import com.worknetwork.models.JobseekerOtherDetails;
import com.worknetwork.models.Languages;
import com.worknetwork.models.Proficiency;
import com.worknetwork.models.Rates;
import com.worknetwork.models.SalaryRange;
import com.worknetwork.models.Skills;
import com.worknetwork.models.UserLogin;
import com.worknetwork.models.UserLogout;
import com.worknetwork.models.appliedjobseekerlisting;

import java.util.Map;

import retrofit.http.Body;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.MultipartTypedOutput;



public interface WorkNetwork_APIServices {
    /**
     * 1) Get Employee Duration API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_employee_duration")
    void api_get_empduration(@FieldMap Map<String, String> map, CancelableCallback<EmploymentDuration> callback);

    /**
     * 2) Get City State Country API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_city_state_country")
    void api_get_city_state_country(@FieldMap Map<String, String> map, CancelableCallback<GetCityStateCountry> callback);

    /**
     * 3) Get Skills API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_skills")
    void api_get_skills(@FieldMap Map<String, String> map, CancelableCallback<Skills> callback);

    /**
     * 4) Get Education API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_education")
    void api_get_education(@FieldMap Map<String, String> map, CancelableCallback<Education> callback);

    /**
     * 5) Get Category
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_category")
    void api_get_category(@FieldMap Map<String, String> map, CancelableCallback<Category> callback);

    /**
     * 6) Get Rates
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_rates")
    void api_get_rates(@FieldMap Map<String, String> map, CancelableCallback<Rates> callback);

    /**
     * 7) Get Languages API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_languages")
    void api_get_languages(@FieldMap Map<String, String> map, CancelableCallback<Languages> callback);

    /**
     * 8) Get Courses
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_courses")
    void api_get_courses(@FieldMap Map<String, String> map, CancelableCallback<Courses> callback);

    /**
     * 9) Get Proficiency API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_proficiency")
    void api_get_proficiency(@FieldMap Map<String, String> map, CancelableCallback<Proficiency> callback);

    /**
     * 10) Get Courses Type
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_courses_type")
    void api_get_courses_type(@FieldMap Map<String, String> map, CancelableCallback<CoursesType> callback);

    /**
     * 11) Get Currency
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_currency")
    void api_get_currency(@FieldMap Map<String, String> map, CancelableCallback<Currency> callback);


    /**
     * 12) Get Industry Type API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_industry_type")
    void api_get_industry(@FieldMap Map<String, String> map, CancelableCallback<IndustryType> callback);

    /**
     * 13) Get Salary Range API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/get_salary_range")
    void api_get_salary_range(@FieldMap Map<String, String> map, CancelableCallback<SalaryRange> callback);


    /**
     * 15) Login API
     *
     * @param map
     */

    @FormUrlEncoded
    @POST("/check_member_login")
    void api_userLogin(@FieldMap Map<String, String> map, CancelableCallback<UserLogin> callback);

    /**
     * 16) Logout API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/user_logout")
    void api_userLogout(@FieldMap Map<String, String> map, CancelableCallback<UserLogout> callback);

    /**
     * 17) Forgot Password API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/forgot_password")
    void api_forgot_password(@FieldMap Map<String, String> map, CancelableCallback<ForgotPassword> callback);

    /**
     * 18) Jobseeker Registration API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/jobseeker_registration")
    void api_jobseeker_registration(@FieldMap Map<String, String> map, CancelableCallback<JobSeekerRegistration> callback);

    /**
     * 19) Employer Registration API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/employer_registration")
    void api_employer_registration(@FieldMap Map<String, String> map, CancelableCallback<EmployerRegistration> callback);

    /**
     * 20) Change Password API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/change_password")
    void api_change_password(@FieldMap Map<String, String> map, CancelableCallback<ChangePassword> callback);

    /**
     * 21) Employer Location API
     *
     * @param
     */
    @POST("/employer_location")
    void api_employer_location(@Body MultipartTypedOutput multipartTypedOutput, CancelableCallback<EmployerLocation> callback);
   /* @FormUrlEncoded
    @POST("/employer_location")
    void api_employer_location(@FieldMap Map<String, String> map, CancelableCallback<EmployerLocation> callback);*/


    /*
    * 22)  Job Seeker Edit Profile
    *
    * */
    /*@FormUrlEncoded
    @POST("/job_seeker_edit_profile")
    void api_job_seeker_edit_profile(@FieldMap Map<String,String> map, CancelableCallback<JobSeekerEditProfile> callback);*/

    /*
   * 22)  Job Seeker Edit Profile
   *
   * */
    @POST("/job_seeker_edit_profile")
    void api_job_seeker_edit_profile(@Body MultipartTypedOutput multipartTypedOutput, CancelableCallback<JobSeekerEditProfile> callback);

    /**
     * 23) JobSeeker Location API
     *
     * @param
     */
    @POST("/job_seeker_location")
    void api_jobseeker_location(@Body MultipartTypedOutput multipartTypedOutput, CancelableCallback<JobSeekerLocation> callback);
   /* @FormUrlEncoded
    @POST("/job_seeker_location")
    void api_jobseeker_location(@FieldMap Map<String, String> map, CancelableCallback<JobSeekerLocation> callback);*/

    /*
    * 24)  Job Seeker Language
    * */
    @FormUrlEncoded
    @POST("/job_seeker_language")
    void api_jobs_seeker_language(@FieldMap Map<String, String> map, CancelableCallback<JobseekerLanguageResponse> callback);

    /*
     * 26)  job_seeker_education
     *
     * */
    @FormUrlEncoded
    @POST("/job_seeker_education")
    void api_job_seeker_education(@FieldMap Map<String, String> map, CancelableCallback<JobseekerEducations> callback);


    /*
    * 25)  Job Seeker Employment
    *
    *
    * */
    @FormUrlEncoded
    @POST("/job_seeker_employment")
    void api_job_seeker_employment(@FieldMap Map<String, String> map, CancelableCallback<JobSeekerEployment> callback);


    /*
    * 27)  Job Seeker Detail Employment
    *
    * */
    @FormUrlEncoded
    @POST("/job_seeker_detail_employment")
    void api_jobseeker_detail_employment(@FieldMap Map<String, String> map, CancelableCallback<JobseekerDetailsEmployment> callback);


    /*
    * 28) JobSeeker Other Details
    *
    * @param map
    * */
    @FormUrlEncoded
    @POST("/job_seeker_other_detail")
    void api_jobseeker_otherdetails(@FieldMap Map<String, String> map, CancelableCallback<JobseekerOtherDetails> callback);

    /*
    * 29) Job Seeker Image Uploads
    * */
    @POST("/job_seeker_image_uploads")
    void api_job_seeker_uploadDocument(@Body MultipartTypedOutput multipartTypedOutput, CancelableCallback<UserLogin> callback);


    /**
     * 31) Job Listing API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/job_listing")
    void api_get_joblisting(@FieldMap Map<String, String> map, CancelableCallback<JobListing> callback);

     /*
    * 32)  Job Search
    *
    *
    */

    @FormUrlEncoded
    @POST("/job_search_listing")
    void api_job_searchlisting(@FieldMap Map<String, String> map, CancelableCallback<JobSearchListing> callback);


    /*
    * 33)  Job Detail
    *
    *
    * */

    @FormUrlEncoded
    @POST("/job_detail")
    void api_get_jobDetails(@FieldMap Map<String, String> map, CancelableCallback<JobDetails> callback);

    /*
    * 34)  Job Detail
    *
    *
    * */

    @POST("/apply_job")
    void api_apply_job(@Body MultipartTypedOutput multipartTypedOutput, CancelableCallback<Apply_Job> callback);
    //void api_apply_job(@FieldMap Map<String, String> map, CancelableCallback<Apply_Job> callback);

    /*
    * 35)  Job Like
    */

    @FormUrlEncoded
    @POST("/add_jobs_like")
    void api_add_job_like(@FieldMap Map<String, String> map, CancelableCallback<AddLikeJob> callback);


    /* 36)  Likes Job Listing
    *
    * */
    @FormUrlEncoded
    @POST("/like_jobs_listing")
    void api_get_like_jobs_listing(@FieldMap Map<String, String> map, CancelableCallback<Job_Listing> callback);


    /*37)  Jobseeker Job Listing*/
    @FormUrlEncoded
    @POST("/jobseeker_job_listing")
    void api_get_jobseeker_job_listing(@FieldMap Map<String, String> map, CancelableCallback<JobseekerJobListing> callback);

    /*38)  Jobseeker Achievements
    *
    * */
    @FormUrlEncoded
    @POST("/job_seeker_achievements")
    void api_get_jobseeker_achievements(@FieldMap Map<String, String> map, CancelableCallback<JobSeekerAchievemet> callback);

    /**
     * 40) Job Listing API
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/employer_job_listing")
    void api_get_employerjoblisting(@FieldMap Map<String, String> map, CancelableCallback<EmployerJobListing> callback);

    /*   * 42)  jobseeker_detail   *   * */
    @FormUrlEncoded
    @POST("/jobseeker_detail")
    void api_jobseeker_detail(@FieldMap Map<String, String> map, CancelableCallback<JobSeekerDetail> callback);

    /**
     * 41) Applied JobSeeker Listing
     *
     * @param map
     */
    @FormUrlEncoded
    @POST("/applied_jobseeker_listing")
    void api_applied_jobseeker_listing(@FieldMap Map<String, String> map, CancelableCallback<appliedjobseekerlisting> callback);


    /*    * 28)  Job Post add
        *  *    * @param map    * */
    @FormUrlEncoded
    @POST("/job_post")
    void api_jobpost(@FieldMap Map<String, String> map, CancelableCallback<JobPostAdd> callback);

    /*
 * 43)  Employer Edit Profile
 *
 * */
    @POST("/employer_edit_profile")
    void api_employer_edit_profile(@Body MultipartTypedOutput multipartTypedOutput, CancelableCallback<Emp_Edit_Profile> callback);

}
