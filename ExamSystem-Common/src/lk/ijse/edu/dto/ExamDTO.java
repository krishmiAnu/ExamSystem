///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lk.ijse.edu.dto;
//
//import java.util.List;
//
///**
// *
// * @author Krishanthi
// */
//public class ExamDTO extends SuperDTO{
//   private String examId;
//   private String examTitle;
//   private String duration;
//   private String date;
//   private String time;
//   private int questionCount;
//   private SubjectDTO subjectDTO;
//   private List<String>questionList;
//   //private ManageQuestionDTO manageQuestionDTO;
//
//    public ExamDTO() {
//    }
////
////    public ExamDTO(String examId, String examTitle, String duration, String date, String time, int questionCount, SubjectDTO subjectDTO, ManageQuestionDTO manageQuestionDTO) {
////        this.examId = examId;
////        this.examTitle = examTitle;
////        this.duration = duration;
////        this.date = date;
////        this.time = time;
////        this.questionCount = questionCount;
////        this.subjectDTO = subjectDTO;
////        this.manageQuestionDTO = manageQuestionDTO;
////    }
////
////    /**
////     * @return the examId
////     */
////    public String getExamId() {
////        return examId;
////    }
////
////    /**
////     * @param examId the examId to set
////     */
////    public void setExamId(String examId) {
////        this.examId = examId;
////    }
////
////    /**
////     * @return the examTitle
////     */
////    public String getExamTitle() {
////        return examTitle;
////    }
////
////    /**
////     * @param examTitle the examTitle to set
////     */
////    public void setExamTitle(String examTitle) {
////        this.examTitle = examTitle;
////    }
////
////    /**
////     * @return the duration
////     */
////    public String getDuration() {
////        return duration;
////    }
////
////    /**
////     * @param duration the duration to set
////     */
////    public void setDuration(String duration) {
////        this.duration = duration;
////    }
////
////    /**
////     * @return the date
////     */
////    public String getDate() {
////        return date;
////    }
////
////    /**
////     * @param date the date to set
////     */
////    public void setDate(String date) {
////        this.date = date;
////    }
////
////    /**
////     * @return the time
////     */
////    public String getTime() {
////        return time;
////    }
////
////    /**
////     * @param time the time to set
////     */
////    public void setTime(String time) {
////        this.time = time;
////    }
////
////    /**
////     * @return the questionCount
////     */
////    public int getQuestionCount() {
////        return questionCount;
////    }
////
////    /**
////     * @param questionCount the questionCount to set
////     */
////    public void setQuestionCount(int questionCount) {
////        this.questionCount = questionCount;
////    }
////
////    /**
////     * @return the subjectDTO
////     */
////    public SubjectDTO getSubjectDTO() {
////        return subjectDTO;
////    }
////
////    /**
////     * @param subjectDTO the subjectDTO to set
////     */
////    public void setSubjectDTO(SubjectDTO subjectDTO) {
////        this.subjectDTO = subjectDTO;
////    }
////
////    /**
////     * @return the manageQuestionDTO
////     */
////    public ManageQuestionDTO getManageQuestionDTO() {
////        return manageQuestionDTO;
////    }
////
////    /**
////     * @param manageQuestionDTO the manageQuestionDTO to set
////     */
////    public void setManageQuestionDTO(ManageQuestionDTO manageQuestionDTO) {
////        this.manageQuestionDTO = manageQuestionDTO;
////    }
//// 
//
//    public ExamDTO(String examId, String examTitle, String duration, String date, String time, int questionCount, SubjectDTO subjectDTO, List<String> questionList) {
//        this.examId = examId;
//        this.examTitle = examTitle;
//        this.duration = duration;
//        this.date = date;
//        this.time = time;
//        this.questionCount = questionCount;
//        this.subjectDTO = subjectDTO;
//        this.questionList = questionList;
//    }
//
//    /**
//     * @return the examId
//     */
//    public String getExamId() {
//        return examId;
//    }
//
//    /**
//     * @param examId the examId to set
//     */
//    public void setExamId(String examId) {
//        this.examId = examId;
//    }
//
//    /**
//     * @return the examTitle
//     */
//    public String getExamTitle() {
//        return examTitle;
//    }
//
//    /**
//     * @param examTitle the examTitle to set
//     */
//    public void setExamTitle(String examTitle) {
//        this.examTitle = examTitle;
//    }
//
//    /**
//     * @return the duration
//     */
//    public String getDuration() {
//        return duration;
//    }
//
//    /**
//     * @param duration the duration to set
//     */
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
//
//    /**
//     * @return the date
//     */
//    public String getDate() {
//        return date;
//    }
//
//    /**
//     * @param date the date to set
//     */
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    /**
//     * @return the time
//     */
//    public String getTime() {
//        return time;
//    }
//
//    /**
//     * @param time the time to set
//     */
//    public void setTime(String time) {
//        this.time = time;
//    }
//
//    /**
//     * @return the questionCount
//     */
//    public int getQuestionCount() {
//        return questionCount;
//    }
//
//    /**
//     * @param questionCount the questionCount to set
//     */
//    public void setQuestionCount(int questionCount) {
//        this.questionCount = questionCount;
//    }
//
//    /**
//     * @return the subjectDTO
//     */
//    public SubjectDTO getSubjectDTO() {
//        return subjectDTO;
//    }
//
//    /**
//     * @param subjectDTO the subjectDTO to set
//     */
//    public void setSubjectDTO(SubjectDTO subjectDTO) {
//        this.subjectDTO = subjectDTO;
//    }
//
//    /**
//     * @return the questionList
//     */
//    public List<String> getQuestionList() {
//        return questionList;
//    }
//
//    /**
//     * @param questionList the questionList to set
//     */
//    public void setQuestionList(List<String> questionList) {
//        this.questionList = questionList;
//    }
//    
//}
