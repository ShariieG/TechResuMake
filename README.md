# TECH-RESU-MAKE
Build smart, professional resumes with ease. TECH-RESU-MAKE is a resume builder designed especially for tech students and professionals to create, manage, and export beautiful, structured CVs using intelligent templates and automation tools.

## 👩‍💻 Developer

**Sharon Galela**  
Email: n.sharongalela@gmail.com  
Portfolio:  
- [Demisize Website](https://www.demisize.co.za)  
- [APD Johannesburg](https://apdjhb.co.za)  

---

## 🧠 About the Project

TECH-RESU-MAKE is a cross-platform resume builder app with the following goals:
- Simplify resume creation
- Offer real-time previews
- Score resume completeness
- Support export to PDF or Word
- Enable tech students to present their skills effectively

---

## 🚀 Features

### 🔹 For Users
- Register, log in/out
- Edit profile (GitHub, LinkedIn, etc.)
- Create, duplicate, and delete resumes
- Add sections:
  - Personal details
  - Technical skills
  - Education
  - Work experience
  - Projects
  - Certifications
- Select templates and preview in real-time
- Export as PDF or Word
- Resume score and improvement suggestions
- Autosave functionality

### 🔸 For System
- Score resume completeness
- Format into selected templates
- Autosave periodically
- Export to file
- Password reset & email verification
- Optional monetization for custom resume services

---

## 🛠️ Tech Stack

**Languages:** Python, Java, C++, C#, SQL  
**Frameworks & Tools:** Java Swing, UiPath, ZOHO Creator (Deluge), Excel  
**Focus Areas:** UI Development, Automation, Data Analysis

---

## 📋 Class Design

| Class         | Description                     | Attributes                              | Responsibilities                         |
|---------------|---------------------------------|-----------------------------------------|------------------------------------------|
| `User`        | Represents a user               | id, name, email, password, GitHub, LinkedIn | Register, login, manage profile/resumes |
| `Resume`      | A resume object                 | id, title, summary, createdDate         | Add/edit sections, export resume         |
| `Skill`       | Technical skills                | name, proficiencyLevel                  | Store skill data                         |
| `Education`   | Education history               | institution, degree, startDate, endDate | Validate and store education data        |
| `Experience`  | Work experience entries         | company, role, startDate, endDate, description | Store job history info          |
| `Project`     | Projects done                   | title, description, technologies, link  | Store project details                    |
| `Certification` | Earned certificates          | name, issuer, issueDate                 | Store certification data                 |
| `Template`    | Resume format                   | id, name, style                         | Apply design styling                     |

---

## 🧩 Class Relationships

- **User ↔ Resume**: Aggregation (1 user → many resumes)
- **Resume ↔ [Skill, Education, etc.]**: Composition
- **Resume ↔ Template**: Association
- *(Optional)* Admin inherits from User

---

## 🧪 Validation Features

- Email format validation
- Password strength checker
- Skill level range (1–5)
- Date range validation
- Mandatory field checks
- URL format validation (GitHub, LinkedIn)

---

## 🔄 Sequence Diagrams
1. User Registration/Login
2. Resume Creation
3. Resume Export

---

## 📅 Project Timeline

### 📌 Phase 1: Weeks 1–4
- Define goals & wireframes
- Set up environment (Java, IDE, GitHub)
- Build UI for input forms
- Implement input validation

### 📌 Phase 2: Weeks 5–12
- Display data in UI
- Export functionality (.txt)
- Improve UX and error handling
- Test & refine UI

### 📌 Phase 3: Weeks 13–16
- Full app testing
- Clean and comment code
- Add README, LICENSE, `.gitignore`
- Final polish for GitHub release

---

## 🏆 Achievements

- 🎓 BSc in IT – North West University (NQF 6)
- 🎓 BSc in Computing – UNISA (In Progress)
- 🏅 Golden Key Honor Society
- 📜 UiPath Automation Explorer
- 📜 Data Analyst Certificate
- 📜 Assessor & Facilitator Certified

---

## ✅ Non-Functional Requirements

- ⏱ Load previews < 2 seconds
- 🔒 HTTPS and encrypted storage
- 📈 High scalability
- 💾 Auto-save and backup
- 🌐 Responsive (Mobile/Desktop)
- 🌍 Accessibility + Localization-ready
- 🔧 Clean, modular, maintainable code
- 🛡 POPIA & GDPR compliant
- 🌐 Cross-browser support

---

## 📄 License

Add your preferred license (MIT recommended) in the `LICENSE` file.

---

## 👋 Let’s Collaborate

I'm open to collaborating on innovative, impact-driven tech projects.  
📬 Reach out via [n.sharongalela@gmail.com](mailto:n.sharongalela@gmail.com)

