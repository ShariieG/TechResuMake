# TechResuMake
TECH-RESU-MAKE is a smart, user-friendly application that allows tech students and professionals to effortlessly build, manage, and export professional resumes. It supports resume scoring, template selection, and real-time previewing, aiming to simplify the job application process with automation and intelligent design.

🎯 Features
User Functionality
Register / Log In / Log Out

Edit profile (GitHub, LinkedIn, etc.)

Create and manage multiple resumes

Add sections: personal info, skills, education, work experience, projects, certifications

Real-time preview with template selection

Export as PDF or Word

Auto-save resumes

Resume scoring and suggestions

Optional resume design services

System Functionality
Resume completeness scoring

Autosave functionality

Export and formatting engine

Email verification / password reset

Resume design monetization (optional)

⚙️ Tech Stack
Languages: Python, Java, C++, C#, SQL
Frameworks / Tools: Java Swing, UiPath, ZOHO Creator (Deluge), Advanced Excel
Areas of Focus: UI Development, Data Analysis, Automation

🛠️ Non-Functional Requirements
Fast load time (< 2 seconds for previews)

Scalability for thousands of users

HTTPS encryption and secure data storage

99.9% uptime

Auto-save and backup for data protection

Mobile, tablet, and desktop responsiveness

Accessible design (keyboard, screen readers)

Browser compatibility (Chrome, Firefox, Safari, Edge)

Modular and maintainable codebase

Compliance with POPIA and GDPR

Support for future multi-language localization

🧩 Class & Object Model
Class	Attributes	Responsibilities
User	id, name, email, password, GitHub, LinkedIn	Register, login, manage profiles/resumes
Resume	id, title, summary, createdDate	Add/edit/export resume sections
Skill	name, proficiencyLevel	Store skills
Education	institution, degree, startDate, endDate	Store academic history
Experience	company, role, startDate, endDate, description	Store work history
Project	title, description, technologies, link	Store project info
Certification	name, issuer, issueDate	Store certifications
Template	id, name, style	Store resume formatting templates

🔗 Class Relationships
User → Resume (Aggregation)

Resume → Skills, Education, Experience, Projects, Certifications (Composition)

Resume → Template (Association)

(Optional) Admin inherits from User

🔄 Sequence Diagrams
User Registration & Login

Create Resume

Export Resume

🧪 Validation & Testing
Email Format Validation

Password Strength Validation

Skill Level Validation (1–5 scale)

Date Range Validation

Required Fields Check

URL Format Validation (GitHub, LinkedIn)

🗓️ Project Timeline
Phase 1 (Weeks 1–4): Planning & UI
Set goals and project scope

Java Swing environment setup

Input forms and basic validation

Wireframes and data flow planning

Phase 2 (Weeks 5–12): Display & Export
Display user data in app

Implement .txt export functionality

Refine layout and error handling

Test and improve usability

Phase 3 (Weeks 13–16): Finalization
Full feature testing

Code clean-up and commenting

Prepare README, LICENSE, .gitignore

GitHub repo setup and polish

