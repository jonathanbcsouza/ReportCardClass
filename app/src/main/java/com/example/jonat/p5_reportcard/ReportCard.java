package com.example.jonat.p5_reportcard;

/**
 * Created by jonat on 19/11/2017.
 */

public class ReportCard {

    private String mUniversity;
    private String mStudent;
    private double mTestGrade1;
    private double mTestGrade2;
    private double mFinalGrade;


    public ReportCard(String mUniversity, String mStudent, double mTestGrade1, double mTestGrade2, double mFinalGrade) {
        this.mUniversity = mUniversity;
        this.mStudent = mStudent;
        this.mTestGrade1 = mTestGrade1;
        this.mTestGrade2 = mTestGrade2;
        this.mFinalGrade = mFinalGrade;
    }

    public String getmUniversity() {
        return mUniversity;
    }

    public void setmUniversity(String mUniversity) {
        this.mUniversity = mUniversity;
    }

    public String getmStudent() {
        return mStudent;
    }

    public void setmStudent(String mStudent) {
        this.mStudent = mStudent;
    }

    public double getmTestGrade1() {
        return mTestGrade1;
    }

    public void setmTestGrade1(double mTestGrade1) {
        this.mTestGrade1 = mTestGrade1;
    }

    public double getmTestGrade2() {
        return mTestGrade2;
    }

    public void setmTestGrade2(double mTestGrade2) {
        this.mTestGrade2 = mTestGrade2;
    }

    public double getmFinalGrade() {
        return mFinalGrade;
    }

    public void setmFinalGrade(double mFinalGrade) {
        this.mFinalGrade = mFinalGrade;
    }


    // The main Estácio requirements is that the grade mean must be greater than 6.
    @Override
    public String toString() {
        mFinalGrade = (mTestGrade1 + mTestGrade2) / 2;

        if (mFinalGrade >= 6) {
            return "University: " + mUniversity +
                    "\nStudent: " + mStudent +
                    "\nTest 1 Grade: " + mTestGrade1 +
                    "\nTest 2 Grade: " + mTestGrade2 +
                    "\n\n Result =\n   Approved: " + mFinalGrade + " ";
        } else {
            return "University: " + mUniversity +
                    "\nStudent: " + mStudent +
                    "\nTest 1 Grade: " + mTestGrade1 +
                    "\nTest 2 Grade: " + mTestGrade2 +
                    "\n\nResult =\n   Reproved: " + mFinalGrade + " ";
        }

    }
}

